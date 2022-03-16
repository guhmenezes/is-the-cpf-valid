<h2 align="center"> Is the cpf valid?<br>
  <h4 align="center">Check if a CPF number is valid with this Java Project !  </h4></h2>
  
  <h2><p align="center">
<a href=""><img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=GREEN&style=for-the-badge"/></a>
</p></h2>

<img src="https://user-images.githubusercontent.com/91099666/158666342-2f2d4165-95ec-4b25-a772-8ccd16d07dc7.png" align="left" width="350px" height="480px">




This repository was created for the practice of studies.  
   
   **The project uses:**  
JDK 11+;  
Swing JOptionPane;  
Vector Manipulation;  
Object Instance and call Method.  

**How to use:**  
1 - Run application;  
2 - In the Input Window, insert only the ELEVEN DIGITS of CPF;  
3 - Click OK button to submit;  
4 - The application will return whether the CPF is valid or not;  
5 - To close, click Cancel button or close button.  
<br>
**Description:**
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
  
***
<p align="center">Examples:<br>CPF: 699.14<strong>8</strong>.540-36</p>

6 * 1 + 9 * 2 + 9 * 3 + 1 * 4 + 4 * 5 + 8 * 6 + 5 * 7 + 4 * 8 + 0 * 9 = 190<br>
190 mod 11 = **3**

6 * 0 + 9 * 1 + 9 * 2 + 1 * 3 + 4 * 4 + 8 * 5 + 5 * 6 + 4 * 7 + 0 * 8 + 3 * 9 = 171<br>
171 mod 11 = **6**

_**It's a Valid CPF**_.
<br>
<p align="center">But, <br> CPF: 699.14<strong>7</strong>.540-36</p>

6 * 1 + 9 * 2 + 9 * 3 + 1 * 4 + 4 * 5 + 7 * 6 + 5 * 7 + 4 * 8 + 0 * 9 = 184<br>
184 mod 11 = **8**

6 * 0 + 9 * 1 + 9 * 2 + 1 * 3 + 4 * 4 + 7 * 5 + 5 * 6 + 4 * 7 + 0 * 8 + 3 * 9 = 171<br>
171 mod 11 = **6**

_**It's not a Valid CPF**_.


If possible:

Star the project  
Find and report issues  
<br>
Made available by [**guhmenezes**](https://github.com/guhmenezes).

