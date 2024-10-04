## sample 

```graphql
mutation{
  addCustomer(input:{
    firstName:"Alireza1"
    lastName:"Akbari1"
  }){
    id
  }
}

```

## result

```json
{
  "data": {
    "addCustomer": {
      "id": "2"
    }
  }
}
```