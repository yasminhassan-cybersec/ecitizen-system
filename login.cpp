#include <iostream>
#include <string>
using namespace std;

int main() {
    const string correct_username = "adminKE";
    const string correct_password = "254Secure";
    
    string username, password;

    cout << "eCITIZEN LOGIN VALIDATION SYSTEM" << endl;
    
    // Get user input
    cout << "Enter username: ";
    getline(cin, username);
    
    cout << "Enter password: ";
    getline(cin, password);
    
    // Validate credentials
    if (username == correct_username && password == correct_password) {
        cout << "Access Granted" << endl;
        cout << "Welcome to eCitizen Services!" << endl;
    } else {
        cout << "Invalid Credentials" << endl;
        cout << "Please check your username and password and try again." << endl;
    }
    
    cout << "Thank you for using eCitizen Services" << endl;
    
    return 0;
}