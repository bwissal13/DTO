

# EmployeeProject

📋 **EmployeeProject** est une application Java conçue pour gérer les informations des employés et des départements au sein d'une entreprise. Ce projet met en pratique l'architecture en couches, les DTO (Data Transfer Objects) et l'interaction avec une base de données pour un stockage efficace des informations.

## 📑 Description

L'application fournit une interface pour :
- Créer, lire, mettre à jour et supprimer des employés.
- Assigner des employés à différents départements.
- Gérer les départements et les informations associées (nom du département, description, etc.).

### Fonctionnalités principales
- **CRUD Employés** : gestion des employés avec des informations telles que le nom, le poste, le salaire et le département.
- **CRUD Départements** : gestion des départements avec des champs comme le nom et la description.
- **Utilisation des DTOs** : pour optimiser la communication entre la couche de service et la couche de présentation.
- **Architecture en couches** : pour une séparation claire entre les différentes responsabilités de l'application.

## 🛠️ Technologie utilisée

- **Java** - pour la logique de l'application
- **Spring Boot** - pour l’architecture en couches et les API RESTful
- **PostgreSQL** - pour la persistance des données
- **Maven** - pour la gestion des dépendances

## 📂 Structure du projet

```plaintext
EmployeeProject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── example/
│   │   │   │   │   ├── employee/
│   │   │   │   │   │   ├── controller/         # Contient les contrôleurs REST
│   │   │   │   │   │   ├── dto/                # Contient les DTOs
│   │   │   │   │   │   ├── entity/             # Contient les entités de base de données
│   │   │   │   │   │   ├── repository/         # Interfaces pour les opérations CRUD
│   │   │   │   │   │   ├── service/            # Contient la logique métier
│   │   │   │   │   │   └── utils/              # Contient des classes utilitaires
│   │   │   │   │   └── EmployeeProjectApplication.java
│   │   ├── resources/
│   │   │   ├── application.properties          # Fichier de configuration
│   │   │   └── schema.sql                      # Script SQL de création de base de données
└── README.md
```

## 🚀 Installation

### Prérequis

- **Java 11** ou plus récent
- **Maven** pour gérer les dépendances
- **PostgreSQL** pour la base de données

### Étapes

1. Clonez le dépôt :
   ```bash
   git clone https://github.com/username/EmployeeProject.git
   ```

2. Installez les dépendances :
   ```bash
   mvn install
   ```

3. Configurez la base de données dans le fichier `application.yaml` :
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/employee_db
   spring.datasource.username=your_db_username
   spring.datasource.password=your_db_password
   ```

4. Lancez l'application :
   ```bash
   mvn spring-boot:run
   ```

```
