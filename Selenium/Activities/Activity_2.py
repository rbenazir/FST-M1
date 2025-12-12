from selenium import webdriver
from selenium.webdriver.common.by import By
with webdriver.Firefox() as driver:
    driver.get("https://training-support.net/webelements/login-form")
    print("Title is "+driver.title)
    driver.find_element(By.ID,"username").send_keys("admin")
    driver.find_element(By.ID,"password").send_keys("password")
    driver.find_element(By.TAG_NAME,"button").click()
    message = driver.find_element(By.CSS_SELECTOR, "h1.text-center")
    print("Login message: ", message.text)