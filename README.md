# S.O.L.I.D Design Principles

---

![Solid Principles]
[![Coverage](.github/badges/jacoco.svg)](https://github.com/dehan13/solid-principles/actions/workflows/build.yml)

## Single Responsibility Principle

Every class should have a single responsibility. A class should have one, and only one, reason to change.

## Open/Closed Principle

You should be able to extend a classes behavior, without modifying it. Software entities should be open for extension, but closed for modification.

## Liskov Substitution Principle

Derived classes must be substitutable for their base classes. Functions that use references to base classes must be able to use objects of derived classes without knowing it.

## Interface Segregation Principle

Make fine grained interfaces that are client specific. Clients should not be forced to depend on interfaces they do not use.

## Dependency Inversion Principle

Depend on abstractions, not on concretions. High-level modules should not depend on low-level modules. Both should depend on abstractions. Abstractions should not depend on details. Details should depend on abstractions.

## Prerequisites

---

### System Requirements

- Java (v11)
- Maven (v3.8.5)
- IntelliJ CE (or any preferred IDE)
- Spring Boot v2.7.0 or later

All of these must be available in your ```path```. To verify things are set up properly, you can run this:
```shell
$ java --version
$ mvn --version
```

If you have trouble with any of these, learn more about the PATH environment variable and how to fix it here for [mac/linux].

### Environment Setup

Clone the repository

```shell
$ git clone git@github.com:dehanz13/SOLID-Principles-Playbook.git
```

Build the project (optional: skip tests)

```shell
$ mvn clean install -DskipTests=true
```

Run application

[mac/linux]: <https://mkyong.com/java/how-to-set-java_home-environment-variable-on-mac-os-x/>
[Solid Principles]: <https://img.shields.io/badge/Solid%20Principle-Software%20Development%20Design%20Principles-green>