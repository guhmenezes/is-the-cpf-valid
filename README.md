# <center>Is the cpf valid?
### Check if a CPF number is valid with this Java Project !  


This repository was created for the practice of studies.  
The project uses:  

JDK 11+;  
Swing JOptionPane;  
Vector Manipulation;  
Object Instance and call Method.  

How to use:  
1 - Run application;  
2 - In the Input Window, insert only the ELEVEN DIGITS of CPF;  
3 - Click OK button to submit;  
4 - The application will return whether the CPF is valid or not;  
5 - To close, click Cancel button or close button.  
<br>  
In Brazil, for a CPF number (Cadastro de Pessoa Física) to be valid, 
the remainder of the division of the sum of the product 
of the first nine
digits with their respective indices (starting in 1) 
must be
equal to the first check digit (tenth digit) and the 
remainder of the 
division of the sum of the product of the first ten
digits with their respective indices (starting in 0) 
must be
equal to the second check digit (eleventh digit)  

Examples:  

<center>CPF: 699.148.540-36</center>

6 * 1 + 9 * 2 + 9 * 3 + 1 * 4 + 4 * 5 + 8 * 6 + 5 * 7 + 4 * 8 + 0 * 9 = 190<br>
190 mod 11 = **3**

6 * 0 + 9 * 1 + 9 * 2 + 1 * 3 + 4 * 4 + 8 * 5 + 5 * 6 + 4 * 7 + 0 * 8 + 3 * 9 = 171<br>
171 mod 11 = **6**

######<center><span style="color:green">It's a Valid CPF.</span></center>  
<br>
<center>But,  

CPF: 699.14<span style="color:red">7</span>.540-36</center>

6 * 1 + 9 * 2 + 9 * 3 + 1 * 4 + 4 * 5 + 7 * 6 + 5 * 7 + 4 * 8 + 0 * 9 = 184<br>
184 mod 11 = **8**

6 * 0 + 9 * 1 + 9 * 2 + 1 * 3 + 4 * 4 + 7 * 5 + 5 * 6 + 4 * 7 + 0 * 8 + 3 * 9 = 171<br>
171 mod 11 = **6**

#####<center><span style="color:red">It's not a Valid CPF.</span></center>


If possible:

Star the project  
Find and report issues  
<br>
Made available by [**<span style="color:black">guhmenezes</span>**](https://github.com/guhmenezes).

