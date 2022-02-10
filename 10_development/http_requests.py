import requests

target = "https://google.com"
response = requests.get(url=target)
print(response.text)