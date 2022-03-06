import json

user = {
  "id" : "gildong",
  "password" : "1234",
  "age" : 30
}

json_data = json.dumps(user, indent=4)
print(json_data)

 