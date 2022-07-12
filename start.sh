echo "Stopping broker"
docker-compose down;

sleep 2;

echo "Starting broker"
docker-compose up -d;

sleep 1:

mvn spring-boot:run;