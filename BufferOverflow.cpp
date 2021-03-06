#include <iostream>
#include <string.h>
using namespace std;

int main(void)
{
	bool authentication = false;
	char cUsername[ 10 ]; // array
	char cPassword[ 10 ]; // array

	cout << "Username : " <<endl; // user input
	cin >> cUsername;

	cout << "Password : " <<endl; // user input
	cin >> cPassword;

	// compares the username and password with "..." and access is given
	if( strcmp(cUsername, "admingvp" ) == 0 && strcmp(cPassword, "admingvppass") ==0 )
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