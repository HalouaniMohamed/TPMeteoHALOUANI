1. Avec quelle partie du code avons-nous paramétré l'url d'appel /greeting
Avec a l'annotation @GetMapping("/greeting") dans la classe HelloWorldController

2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?
Avec la ligne return "greeting" dans le methode greeting de la classe HelloWorldController

3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?
Le nom est envoyé en tant que paramètre de requête via l'URL

## Etape 17 : Différence observée
À l'étape 15, aucune table n'était visible dans la base de données H2.  
À l'étape 17, une table `ADDRESS` est apparue avec les colonnes

## Etape 18 : Explication de l'apparition de la table
L'apparition de la table addresse dans la base de donnees H2 est grace a l'annotation **@Entity** dans la classe Adress et grace à **Hibernate** et à la configuration **JPA** de Spring boot.

## Etape 20 :
Oui les données sont ajoutées

## Etape 22
L'annotation **@Autowired** dans Spring est utilisée pour **l'injection de dépendances**. Elle permet au framework Spring de résoudre et d'injecter automatiquement les beans nécessaires dans une classe donnée

## Etape 30
Bootstrap a été intégré au projet en utilisant le *CDN*, ce qui permet une intégration rapide sans avoir à télécharger les fichiers localement.

- Dans le fichier layout.html, les lignes suivantes ont été ajoutées 
- `<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">`
- `<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>`

## TP4
## Etape 6
- Pour des raisons sécurité et du protection de l'API il est necessaire d'utilisation une clé API(token) pour accéder à MeteoConcept API
l'URL à utiliser est : https://api.meteo-concept.com/api/forecast/daily/0?token=ca460ba21adb470f6a0507c0054f268729727475686382ff4a417da665a0bfe4
- La méthode GET est utilisée pour obtenir les informations
- Les paramètres sont passés en ajoutant "&latlng=" puis le couple de valeurs séparées par une virgule.
- La température et Les prévisions météo se trouvent dans la section forecast.