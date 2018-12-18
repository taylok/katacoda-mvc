### Test and Verify the application locally

mvn spring-boot:run

### Deploy to OpenShift Container Platform

oc login <server> --insecure-skip-tls-verify=true -u developer -p developer

oc new-project dev --display-name="Dev - Spring Boot App"

mvn package fabric8:deploy -Popenshift

### Re-deploy the Application

mvn package fabric8:undeploy fabric8:deploy -Popenshift

