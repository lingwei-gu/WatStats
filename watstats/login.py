from selenium import webdriver
driver = webdriver.Firefox(executable_path='your_path')
driver.get("https://watcard.uwaterloo.ca/OneWeb/Account/LogOn")
elem_user = driver.find_element_by_name("Account")
elem_user.send_keys("your_account")
elem_pwd = driver.find_element_by_name("Password")
elem_pwd.send_keys("your_password")
elem = driver.find_element_by_tag_name("button")
elem.click()
