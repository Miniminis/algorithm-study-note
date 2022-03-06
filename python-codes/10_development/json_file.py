import json 


user = {
  "id" : "gildong",
  "password" : "1234",
  "age" : 30
}

with open("user.json", "w", encoding="utf-8") as file:
  json_data = json.dump(user, file, indent=4)