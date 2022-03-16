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
5. Créez un fichier "credentials" contenant les informations de connexion AWS ([voir ce lien](https://docs.aws.amazon.com/fr_fr/IAM/latest/UserGuide/id_credentials_access-keys.html#Using_CreateAccessKey)).
```sh
[default]
aws_access_key_id = "Access key id"
aws_secret_access_key = "Secret access key"
```
6. Déplacer dans ce même dossier la clé .pem que vous pouvez créez comme expliqué [ici](https://docs.aws.amazon.com/fr_fr/AWSEC2/latest/UserGuide/ec2-key-pairs.html#having-ec2-create-your-key-pair) et nommez la `usKey.pem`. ATTENTION ! Veillez bien à créer la clé dans la région **us-east-1** !
7. Rendez-vous dans le dossier gestionScolaire/terraform/app.
8. Ouvrez un invité de commande à cet emplacement.
9. Lancez la commande `terraform init` pour initialiser le projet.
10. Lancez la commande `terraform plan` pour préparer les actions.
11. Lancez la commande `terraform apply` pour executer terraform. Saisissez "yes" lorsque vous verrez la réponse suivante : ![CONTINUE_TERRAFORM](https://github.com/asemin08/GestionGlasses-terraform/blob/main/imgs_reamde/YesOrNot.png)
12. Une fois la commande terminée, rendez-vous ouvrez le fichier "ip_connection" et récupérer l'url précisé. Vous devriez voir le fichier suivant s'afficher:
  ![form_conn](https://github.com/MaximeDzN/gestionScolaire/blob/main/readme_img/conn.png)
13. Entrez les informations suivantes pour vous connecter:
```sh
login: directeur
mot de passe: directeur
```

---

## conclusion

Il est possible de déployer l'application avec terraform. Cependant il aurait dû être possible selon l'énoncé d'inclure Jenkins. Par manque de temps je n'ai pas pu ajouter cette brique 
De plus j'ai rencontré certaines difficultés sur des tests. Pour améliorer ces deux points j'estime qu'il me faudrait une demi-journée supplémentaires.
