curl --location --request POST 'localhost:8081/publish' \
--header 'Content-Type: application/json' \
--data-raw '{
    "msg": "teste 123"
}'