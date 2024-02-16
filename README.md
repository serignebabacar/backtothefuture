# Forward to the Past

Ce projet Java implémente un calculateur de prix de films, 
en fonction du comportement suivant :

le dvd d'un volet de la saga vaut 15€ .

Pour l'achat de 2 volets DIFFÉRENTS de la saga, on applique une réduction de 10% sur l'ensemble des DVDs "Back to the Future" achetés.

Pour l'achat de 3 volets DIFFÉRENTS de la saga, on applique une réduction de 20% sur l'ensemble des DVDs "Back to the Future" achetés

La boutique de DVDs vend également d'autres films qui coûtent chacun 20€.


## Fonctionnalités

Pour le calcul du prix final apres réduction. Le programme prend : 
- En entré ,un panier sous forme de texte, séparé par des retours à la ligne qui contient le nom des films achetés
- En sortie, le nombre représentant le prix

  - Exemple

          input :
        
          Back to the Future 1
        
          Back to the Future 2
        
          Back to the Future 3
        
          Output :
        
          36
## Comment utiliser

Clonez le dépôt :

```bash 
git clone https://github.com/serignebabacar/backtothefuture.git
```

   
Pour compiler le code source :

```bash 
javac Main.java
```

Pour exécuter le programme :
  ```bash
   java Main  
          "Back to the Future 1
          
          Back to the Future 2
          
          Back to the Future 3"
```