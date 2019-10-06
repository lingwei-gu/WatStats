from selenium import webdriver
driver = webdriver.Firefox(executable_path='geckodriver')
#make sure that geckodriver is included in your package!

driver.get("https://watcard.uwaterloo.ca/OneWeb/Account/LogOn")

elem_user = driver.find_element_by_name("Account") #input account
elem_user.send_keys("your_account")

elem_pwd = driver.find_element_by_name("Password") #input password
elem_pwd.send_keys("your_password")

elem = driver.find_element_by_tag_name("button") #click button
elem.click()
