# gestionScolaire
---
## Le projet

Cette application met en scène un environnement de gestion d'étudiant. Cette v1 permet de s'authentifier ainsi que de créer des étudiants.

---

## Conception

Dans un premier temps, j'ai réalisé divers diagrammes UML.

### Diagramme de cas d'utilisation

### Diagrammes de séquence

### Diagrammes d'activité

### Diagramme de classe

---
## Couverture de code

Une couverture de code de 80% était demandé. Voici une image montrant l'état de couverture de l'application
![CODE_COVERAGE](https://github.com/asemin08/GestionGlasses-terraform/blob/main/readme_img/coverage.png)


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
