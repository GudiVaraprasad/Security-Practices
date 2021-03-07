#include <iostream>
#include <string.h>
using namespace std;

int main(void)
{
	bool authentication = false;
	char cUsername[ 10 ]; // array
	char cPassword[ 10 ]; // array

	cout<< "Before accepting values\n" <<endl;
	cout<< "Username address : \n" << &cUsername <<endl;
	cout<< "Username value : \n" << cUsername <<endl;
	cout<< "Password address : \n" << &cPassword <<endl;
	cout<< "Password value : \n" << cPassword <<endl;
	cout<< "Authentication address : \n" << &authentication <<endl;
	cout<< "Authentication value : \n" << authentication <<endl;

	cout << "Enter Username : ";// user input
	cin >> cUsername;

	cout<< "After accepting values\n" <<endl;
	cout<< "Username address : \n" << &cUsername << endl;
	cout<< "Username value : \n" << cUsername << endl;
	cout<< "Password address : \n" << &cPassword << endl;
	cout<< "Password value : \n" << cPassword << endl;
	cout<< "Authentication address : \n" << &authentication << endl;
	cout<< "Authentication value : \n" << authentication << endl;

	cout << "Password : \n"; // user input
	cin >> cPassword;

	cout<< "After accepting both username and password values\n" <<endl;
	cout<< "Username value : \n" << cUsername << endl;
	cout<< "Password value : \n" << cPassword << endl;
	cout<< "Authentication value : \n" << authentication << endl;

	// compares the username and password with "..." and access is given
	if( strcmp(cUsername, "admingvp" ) == 0 && strcmp(cPassword, "pass") ==0 )
	{
		authentication = true;
		//cout << authentication <<endl; //1
	}

	if(authentication)
	{
		cout << "Access granted\n" <<endl;
		//cout << authentication;
	}
	else 
	{
		cout << "Wrong username and password\n";
	}

	return(0);
}