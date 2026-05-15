# SkillEX - Update 1: Entity and Repository

This repository contains the Entity classes and Repository interfaces for the SkillEX project based on the EER diagram.

## Assignment Scope

- Entity classes are inside `src/main/java/com/cse/project/entity`
- Repository interfaces are inside `src/main/java/com/cse/project/repository`
- H2 in-memory database is used, so no manual database setup is required
- No controller, service, frontend, or business logic is included in this update

## How to Run

```bash
./gradlew bootRun
```

On Windows:

```bash
gradlew.bat bootRun
```

## H2 Console

After running the project, H2 console can be opened at:

```text
http://localhost:8080/h2-console
```

JDBC URL:

```text
jdbc:h2:mem:skillex
```
