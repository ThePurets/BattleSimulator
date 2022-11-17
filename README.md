


# BattleSimulator

***
<h1>Description</h1> 

<p>This is a Battle Simulator Game written in Java Language, version openJdk 19.

You can choose between a Warrior and a Wizard. You will be assigned a random name 
and random values. The battle will finish when one of the players has an hp of 0.
The battle is 1 vs. 1 and will be by rounds, in each round both combatants will attack 
at the same time (so even if one combatant does the killing blow both will take damage). 
So the combat could end in a tie. In case of a tie, the battle is restarted to have only one winner.</p>

***
<h2>Functionalities:</h2>



<p>

### Classes

There are three classes and one interface:

Character, Warrior and Wizard.
This interface is called Attacker.



This interface has:

A public void function attack() that takes a character as a parameter.
We have two types of characters, warriors and wizards, who have different attributes and combat styles. 


### Character class


Variable called id of data type string, auto-generated (Private member)

Variable called name of data type string (Private member)

Variable called hp of data type int, random between 100-200 to warriors and 50-100 for wizards, representing the health points (Private member)

Variable called isAlive of data type boolean defaulted to true (Private member)

A “parameterized” constructor that takes name and hp (as parameters)

Public Getter functions to access these variables

Public Setter functions to change these variables


### Warrior Class

This class is derived from the Character class. A Warrior is a Character that fights by attacking. Attacks inflict damage and in order to do one, stamina is required

The Warrior class has:

Variable called stamina of data type int, random between 10-50, representing a resource the warrior consumes to make an attack (Private member)

Variable called strength of data type int, random between 1-10, measuring how strong the warrior attack is (Private member)

Public Getter functions to access these variables

Public Setter functions to change these variables

A parameterized constructor that takes name, hp, stamina and strength

A public function that overloads attack() implemented in the Attacker interface, that will take a character as a parameter and reduce that character’s health based on the strength of the attack.


### Wizard class

This class is derived from the Character class. A Wizard is a Character that fights by casting spells. Spells inflict damage and require mana to be cast.

The Wizard class has:

Variable called mana of data type int, random between 10-50, representing a resource the wizard consumes to cast spells (Private member)

Variable called intelligence of data type int, random between 1-50, measuring how strong the wizard spells are (Private member)

Public Getter functions to access these variables

Public Setter functions to change these variables

A parameterized constructor that takes name, hp, mana, and intelligence

A public function that overloads attack() implemented in the Attacker interface, that will take a character as a parameter and reduce that character’s health based on the intelligence of the spell

<h3>How the battle simulator works</h3>

The characters are created before the battle starts. They can have either the same character type or different character types.

The battle is 1 vs. 1 and will be by rounds, in each round both combatants will attack at the same time (so even if one combatant does the killing blow both will take damage). So the combat could end in a tie. In case of a tie, the battle is restarted to have only one winner.

A complete log of the battle is displayed on the command line. When the battle is over the winner should be displayed as well.

### Character Attacks

Both wizards and warriors will have the same attack command defined by an interface called Attacker.

Warrior:

Warriors are strong well-armored characters that focus on the attribute of strength. Every round a warrior will have randomly either a Heavy attack or a Weak attack. The damage of a Heavy attack is equal to their strength and every hit will decrease their stamina by 5 points. The damage of a Weak attack is half of the strength (truncate decimals). Every Weak attack will recover his stamina by 1.

If a warrior does not have the stamina to make a Heavy attack he will do a Weak attack instead.

If a warrior does not have the stamina to do a Weak attack he will not inflict any damage and recover his stamina by 2.

Wizard:

Wizards are the masters of the arcane their main attribute is intelligence. Every round a wizard will try to randomly cast either a Fireball or a Staff hit. The damage of a Fireball is equal to his intelligence and every Fireball will decrease their mana by 5 points. The damage of a staff hit is equal to 2. Every staff hit will recover his mana by 1.

If a wizard does not have the mana to cast a Fireball he will do a Staff hit instead.

If a wizard does not have the mana to cast a Staff hit he will not inflict any damage and recover his mana by 2.

 </p>


***
### Authors:

<a href="https://github.com/RobertoVetere" target="_blank">Roberto Vetere</a>

<a href="https://github.com/RoseB98" target="_blank">Rosi Blanco</a>

<a href="https://github.com/rubendelar" target="_blank">Rubén del Olmo</a>

<a href="https://github.com/AlfonsoBarguno" target="_blank">Alfonso Barguñó</a>





