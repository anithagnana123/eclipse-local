'''
Created on 06-Jun-2022

@author: User
'''
print("Hello World")

opt = 0
amount = 0  

class Bank:
    
    IFSC = 0
    bank = 'c'
    branch = 'j'
    loc = 'h'
    
    
    def __init__(self,a,b,c,d):
        # Bank information
        self.IFSC = a
        self.bank = b
        self.branch = c
        self.loc = d
    
    def displayBank(self):
        print("IFSC:",self.IFSC)
        print("Bank:",self.bank)
        print("Branch:",self.branch)
        print("location:",self.loc)
    


class Customer:
    
    CID = 'a'
    name = 'c'
    address = 'j'
    contact = 0
    
    
    def __init__(self,a,b,c,d):
        # Bank information
        self.CID = a
        self.name = b
        self.address = c
        self.contact = d
    
    def displayCust(self):
        print("Customer ID:",self.CID)
        print("name:",self.name)
        print("address:",self.address)
        print("contact:",self.contact)
    


class Account(Bank):
      
    
    def __init__(self,a1,a2,a3,a4):
        super().__init__(a1,a2,a3,a4)
        
    def getAccountInfo(self,AccountID,balance):
        self.AccountID = AccountID
        self.balance = balance
        self.amount = balance
        if opt == '1':
            print("Account information")
            print("Account ID: " + str(self.AccountID))
            print("Balance: " + str(self.balance))
            print("Customer information")
            cust.displayCust()           
    
    
    def deposit(self,damt,dyn):
        self.damt = damt
        self.amount = self.amount + damt
        print("Deposit made successfully")
        print("balance:" + str(self.amount))
        
    def withdraw(self,wamt):
        self.wamt = wamt
        self.amount = self.amount - wamt
        print("Withdrawal made successfully")
        print("balance:" + str(self.amount))
        
    def getBalance(self):
        print("balance:" + str(self.amount))
        

cust = Customer('c001','Chris','shols',91092121213)    


class Sav_Acct(Account):
     
    
    def __init__(self,a1,a2,a3,a4):
        super().__init__(a1,a2,a3,a4)
        
    def withdraw(self,wamt):
        self.wamt = wamt
        self.minbal = self.amount - wamt
        print(self.minbal)
        if(self.minbal > 500):
            print("Withdrawal made successfully")
            print("balance:" + str(self.minbal))
        else:
            print("withdrawal incomplete")
            
        
class Menu:
    
    global opt,amount
    print("Menu")
    print("1.Get Savings Account details")
    print("2.Deposit")
    print("3.Withdraw")
    print("4.Balance")
    opt = input("Enter the option: ") 
    
    @staticmethod
    def option(): 
        sacct = Sav_Acct(1003,'TMB','Shols','TN')  
        if opt == '1':
            print("savings acct")
            # get account information
            sacct.getAccountInfo(2,3232)    
        elif opt == '2':
            dyn = input("Do you want deposit(true/false):")
            if dyn == 'true':
                damt = int(input("Enter the deposit amount:"))
                sacct.getAccountInfo(2,3232) 
                sacct.deposit(damt,dyn)
        elif opt == '3':
            wamt = int(input("Enter the withdrawal amount:"))
            sacct.getAccountInfo(24,3232) 
            # deposit 2000 to the account
            sacct.withdraw(wamt)
        else:
            print("Account Balance:")
            sacct.getAccountInfo(2,3232)
            # get Balance
            sacct.getBalance()
                
Menu.option()