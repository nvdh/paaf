# PAAF
The Passive Aggressive Annotation Framework (PAAF) provides a set of type-safe annotations that developers can use to express passive agression; the framework is provided as a type-safe alternative to comments.

## Usage, general

### Expressing justification

`@Akrasia` : When you are coding a solution while you actually know that another solution would be far better, you can annotate that code with the `@Akrasia` annotation. Akrasia is the phenomenon that people sometimes act against one's better judgment.

*Example*:

```java
@Akrasia
public void invokeOneByOne() {
  ...  
}
```

`@Altruistic` : Whenever you are coding that something that an other team should actually be coding, but they didn't have time to do it since their own code is so screwed up they are consuming every minute to deal with their own legacy, you can use the `@Altruistic` annotation. Since you are so altruistic, you are offering your own time to fix their code (albeit in 1/10th of the time they would need).

*Example*:

```java
@Altruistic
public void workaroundForBugsInTheCodeOfTheOtherTeam() {
  ...  
}
```

`@BlackBox` : How many times did you encounter a method with jigglish code that you have no idea what it's doing? To indicate to your fellow team members that you have literally no idea what this code is doing, use the `@BlackBox` annotation, it is less intrusive than using @Deprecate

`@Calimero` : Whenever there was a team decision and you were the *only* one on the whiteboard that did not agree with the decision, because it was a very bad idea, but they chose you to implement the bad idea, you can use the `@Calimero` annotation to express the fact that you did not intend to write this code, but since you are a team player, you follow the team.

`@Hybris` : If you started coding a method yourself with too much confidence and you thought you would pull it off, but 8 hours later, you are left with a method that seems to work, but you are not really a hundred percent sure why, you can indicate your overconfidence with the `@Hybris` method.

`@Melatonin` : When you are working at night, the effects of sleep deprivation will sneak into your code and things like small typo's start to appear. Since you are not able to detect those early in the morning, you can proactively indicate that you are working hard at night to justify your likely-to-appear errors by using `@Melatonin`

### Expressing an apology

`@Ygolopa` : Sometimes you just want to apologize to the user, but using a comment is not typesafe, these times you can use the `@Ygolopa` annotation, which is an obfuscated form of the word Apology.
