## sample 

```graphql
query{
    customers{
        id
        firstName
        lastName
    }
}

```

## result

```json
{
  "data": {
    "customers": [
      {
        "id": "1",
        "firstName": "Alireza",
        "lastName": "Akbari"
      },
      {
        "id": "2",
        "firstName": "Alireza1",
        "lastName": "Akbari1"
      }
    ]
  }
}
```