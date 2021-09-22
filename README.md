# equipment-toy
Playing around with Kotlin and Spring


# Creating events

You need to run the server first, and then it listens on locahost:8080

1. Open something like Postman or cURL that can send POST requests
2. Set up a POST request to your localhost, the header should probably be `Content-Type:application/json`
3. The body of the request should be a json object that matches the schema laid out in EventSchema.kt, here's an example
```
{
    "eventType": "CollectionTimeUpdated",
    "zencargoReference": "ZTEST-1",
    "cargoId": "12345",
    "cargoType": "VEHICLE",
    "collectionDate": "2021-08-01",
    "collectionTime": "08:30"
}
```

This should trigger the EventController and will create an Event that will be handled by the relevant services.
