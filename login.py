# eCitizen Login Validation System - Python Version

def main():
    correct_username = "adminKE"
    correct_password = "254Secure"
    
    print("eCITIZEN LOGIN VALIDATION SYSTEM")
    
    # Get user input
    username = input("Enter username: ")
    password = input("Enter password: ")
    
    # Validate credentials
    if username == correct_username and password == correct_password:
        print("Access Granted")
        print("Welcome to eCitizen Services!")
    else:
        print("Invalid Credentials")
        print("Please check your username and password and try again.")
    
    print("\nThank you for using eCitizen Services")

# Run the program
if __name__ == "__main__":
    main()