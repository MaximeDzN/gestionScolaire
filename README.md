# gestionScolaire
---
## Le projet

Cette application met en scène un environnement de gestion d'étudiant. Cette v1 permet de s'authentifier ainsi que de créer des étudiants.

---

## Conception

Dans un premier temps, j'ai réalisé divers diagrammes UML.

### Diagramme de cas d'utilisation

![USECASE](https://github.com/MaximeDzN/gestionScolaire/blob/main/conception/Diagramme%20de%20cas%20d'utilisation/usecase.png)

### Diagrammes de séquence

[Répertoire](https://github.com/MaximeDzN/gestionScolaire/tree/main/conception/Diagrammes%20de%20s%C3%A9quence)

### Diagrammes d'activité

[Répertoire](https://github.com/MaximeDzN/gestionScolaire/tree/main/conception/Diagrammes%20d'activit%C3%A9s)

### Diagramme de classe

![CLASS](https://github.com/MaximeDzN/gestionScolaire/blob/main/conception/Diagramme%20de%20classe/class.png)

---
## Couverture de code

Une couverture de code de 80% était demandé. Voici une image montrant l'état de couverture de l'application
![Répertoire](https://github.com/MaximeDzN/gestionScolaire/blob/main/readme_img/coverage.png)


---

## Déploiement de l'application

1. Pour déployer l'application vous aurez besoin du logiciel [terraform](https://www.terraform.io/downloads) version 1.1.7
2. Une fois terraform installé, vous devrez télécharger ce dépôt git.
3. Vous devrez ensuite vous rendre dans le dossier gestionScolaire/terraform
4. Créez un dossier .aws
5. Déposez un fichier "credentials" contenant les informations de connexion AWS créée plus tôt.
```sh
[default]
aws_access_key_id = "Access key id"
aws_secret_access_key = "Secret access key"
```
6. déplacer dans ce même dossier la clé .pem que vous avez créée plus tôt et nommez la `usKey.pem` .
7. 
