# Factory Method — Sistema de Logística

Ejemplo del patrón de diseño creacional **Factory Method** en Java, hecho para la exposición de Ingeniería de Software 2.

## Estructura

| Rol | Clases |
   |---|---|
| Product | `Transporte` |
| Concrete Product | `Camion`, `Barco`, `Avion` |
| Creator | `Logistica` (declara `crearTransporte()`) |
| Concrete Creator | `LogisticaTerrestre`, `LogisticaMaritima`, `LogisticaAerea` |
| Cliente | `Main` |

## Cómo ejecutarlo

Abre el proyecto en IntelliJ y ejecuta `src/logistica/Main.java`, o desde la terminal:

```
   javac -encoding UTF-8 -d out src/logistica/*.java src/logistica/*/*.java
   java -cp out logistica.Main
```

## Referencias

- Gamma, Helm, Johnson y Vlissides. *Design Patterns: Elements of Reusable Object-Oriented Software* (1994).
- Refactoring.Guru — Factory Method: https://refactoring.guru/es/design-patterns/factory-method

## Uso de IA

El código se desarrolló con apoyo de Claude (Anthropic), modelo Claude Opus 5.5, y fue revisado, probado y comprendido por mí antes de publicarse.