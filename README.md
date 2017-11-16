# PAAF
The Passive Aggressive Annotation Framework (PAAF) provides a set of type-safe annotations that developers can use to express passive agression; the framework is provided as a type-safe alternative to comments.

## Usage, general

### Expressing justification

**`@Akrasia`** : When you are coding a solution while you actually know that another solution would be far better, you can annotate that code with the `@Akrasia` annotation. Akrasia is the phenomenon that people sometimes act against one's better judgment.

*Example*:

```java
    @Akrasia
    public void invokeOneByOne() {
      ...  
    }
```

**`@Altruistic`** : Whenever you are coding that something that an other team should actually be coding, but they didn't have time to do it since their own code is so screwed up they are consuming every minute to deal with their own legacy, you can use the `@Altruistic` annotation. Since you are so altruistic, you are offering your own time to fix their code (albeit in 1/10th of the time they would need).

*Example*:

```java
    @Altruistic
    public void workaroundForBugsInTheCodeOfTheOtherTeam() {
      ...  
    }
```
**`@Backlog`** : A lot of times you are forced by management to implement a quick hack and after heavy fighting the only thing you got in return is a lousy ticket in the backlog, with the promise that the hack will some day, in some universe be fixed and resolved in an appropriate, clean way. However, that ticket will always stay on the backlog due to priority suffocation. In those cases, you can use `@Backlog` and indicate the appropriate ticket number.

*Example*:

```java
    @Backlog("SFT-634")
    public void temporaryUglyHack() {
        //hack here
    }
```

**`@Calimero`** : Whenever there was a team decision and you were the *only* one on the whiteboard that did not agree with the decision - because it was a very bad idea - but they chose you to implement the bad idea, you can use the `@Calimero` annotation to express the fact that you did not intend to write this code, but since you are a team player, you follow the team.

**`@Hybris`** : If you started coding a method yourself with too much confidence and you thought you would pull it off, but 8 hours later, you are left with a method that seems to work, but you are not really a hundred percent sure why, you can indicate your overconfidence with the `@Hybris` method.

**`@Melatonin`** : When you are working at night, the effects of sleep deprivation will sneak into your code and things like small typo's start to appear. Since you are not able to detect those early in the morning, you can proactively indicate that you are working hard at night to justify your likely-to-appear errors by using `@Melatonin`

### Expressing an apology

**`@Ygolopa`** : Sometimes you just want to apologize to the user, but using a comment is not typesafe, these times you can use the `@Ygolopa` annotation, which is an obfuscated form of the word Apology.

### Expressing assessments

**`@BlackBox`** : How many times did you encounter a method with jigglish code that you have no idea what it's doing? To indicate to your fellow team members that you have literally no idea what this code is doing, use the `@BlackBox` annotation, it is less intrusive than using @Deprecate

**`@CodeSmell`** : When you encounter a code smell, you can let your fellow team members know by annotating the code with `@CodeSmell` and indicate the appropriate smell such as `CYCLOMATIC_COMPLEXITY`, `REFUSED_BEQUEST`, `INAPPROPRIATE_INTIMACY`, `FEATURE_ENVY` or `CYCLOMATIC_COMPLEXITY`.

*Example*:

```java
    @CodeSmell(CYCLOMATIC_COMPLEXITY)
    public void isPrime() {
        //nested conditionals
    }
```

**`@AntiPattern`** : When you encounter an anti pattern, you can let your fellow team members know by annotating the code with `@AntiPattern` and indicate the appropriate pattern such as `BUSY_WAITING`, `CODING_BY_EXCEPTION`, `ERROR_HIDING`, `LAVA_FLOW`, `MAGIC_NUMBER`, `MAGIC_STRING`, `OBJECT_ORGY`.

*Example*:

```java
   @AntiPattern(Pattern.ERROR_HIDING)
    public void liveOnTheEdge() {
        try {
            somethingDangerous();
        } catch (Exception e){
            //do nothing
        }
    }
```

### Expressing a warning

**`@GodChild`** : Sometimes you encounter crappy code, but there is no way you can refactor it, because it was written by the manager at the times he was still a developer. He got promotion to get rid of him as a developer, but he still won't bear with changes to his code, since he is God now. Protect your fellow developers from fiddling with this code by annotating it using the `@GodChild` annotation.

*Example*:

```java
   @GodChild
    public void manuallyComposeJSONByStringConcatenation() {
        
    }
```

**`@QuantumEntanglement`** : Sometimes you encounter code that should be refactored, but whatever you change in the code has side effects in parts of the codebase that seem totally unrelated. Since those effects are only visible after you run your tets suites of the other modules in your codebase, you should prevent other developers in your team to fiddle with this code as they won't be smart enough to understand the ripple effects.

