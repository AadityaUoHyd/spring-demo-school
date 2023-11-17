# Deploying Web Application in AWS ElasticBeanstalk
1. Login to AWS console and Click on Elastic Beanstalk.
2. Click on “create application”.
3. Environment tier should be “Web Server Environment”. Provide Application name in “Application Information”. Say, “demoschool”. In platform box, let the radio button as “managed platform”, and choose “Java” as platform there.
4. In “Application Code”, choose “upload your code” option. Provide your version label, say.. ‘demoschool-source-v1’. Now click on “local file” option, then click on Choose file and upload your code in jar from target file. Now click on NEXT.
5. Now open IAM service of AWS in another tab for creating a role. Create Role -> AWS Service -> Chose “Elastic Beanstalk” in ‘Use cases for other AWS services’. Now click on “Elastic Beanstalk -Customizable” option -> Next. Now provide roleName, say I’ve given…”DemoSchoolElasticBeanstalk” -> create role.
6. Now create one more role for EC2 instance. Create Role -> AWS Service -> this time select EC2 radio button in use case - > Next -> Select 3 Permission policies (AWSElasticBeanstalkWebTier, AWSElasticBeanstalkWorkerTier, AWSElasticBeanstalkMulticontainerDocker) and click on next -> Now provide role name (say, DemoSchoolEc2BeanStalk) -> create role.
7. Now go back to old ElasticBeanstalk tab. Click on ‘use an existing service role’ radio button -> if you refresh you’ll find  “DemoSchoolEc2BeanStalk” in ‘Existing service role’, select that.  Select “DemoSchoolElasticBeanstalk” at ‘EC2 instance profile’. Click on next.
8. Now you are in “Set up networking, database and tag” page. if you want to configure your Database detail (say AWS RDS) then configure it, else click on next.
9. Now you are in “Configure instance traffic and scaling” page. if you want to configure those then configure it, otherwise click on next.
10. Now you are in “Configure update, monitoring and logging” page. if you want to configure those then configure it, else before clicking on next set the port in environment properties section.(say, click on “Add environment property” then ‘SERVER_PORT’ as Name, and ‘5000’ as value). Now click on next ->  click on submit at ‘Review page’.
<br><br>Note : You need to provide these 3 Name:Value pair at environment properties in case you are using AWS managed RDS (Though, in real time we will use AWS Secret manager for it) – 
SPRING_DATASOURCE_URL
SPRING_DATASOURCE_USERNAME
SPRING_DATASOURCE_PASSWORD
And do not forget to provide inbound traffic rules in ‘Security Groups’ for AWS RDB. In case you want, you can also provide “SPRING_PROFILES_ACTIVE” as “prod” in environment properties.<br><br>
11. Now wait for few minutes until beanstalk launches your code. Now copy the domain name from Beanstalk and hit that URL. You’ll successfully find your web application.
