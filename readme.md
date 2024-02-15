## Test project for @ConfigurationProperties + Lombok

   
 also can be used for recreating the case with not-working Spring beans completion:
 
- open for example the `LombokCompoUsingQualifiedBean` class
- in the method body invoke completion for the beans:
   no completion is available, though all the beans are properly detected and shown in the Spring toolwindow
- add one more component to context, for example, uncomment the `@Component` annotation in the `SomeComponent2` class
- invoke beans completion again - now it works.