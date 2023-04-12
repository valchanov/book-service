# Book-service

### Spring 6, Spring Boot 3, R2DBC, WebFlux

_For testing purposes the service is deployed to the Render cloud: https://book-api-8zon.onrender.com. Note that if the
service is not requested for 15 minutes, it will be shut down. After that it will need about 1-2 minutes to start up
again. So, the first request only is expected to be slow!_

**API Documentation**: http://localhost:8080/webjars/swagger-ui/index.html

### Locally Running And Monitoring

1. If you want to receive mails for alerts, you need first to configure *monitoring/alertmanager.yml* with your Gmail
   address and app password (Create alerts for example for: server not running, too many requests,memory usage greater
   than 95%)
1. Run `docker-compose up` to start book-service app, Prometheus, AlertManager, Grafana
1. Grafana is available at [http://localhost:3000](http://localhost:3000) (login is admin/admin). Try importing the
   JVM (Micrometer) [dashboard](https://grafana.com/grafana/dashboards/12900) with ID 12900. The dashboard looks like:
   ![](./grafana-dashboard.png?raw=true "Project Architecture")
