#### create object with new keyword -> new PizzaController
#### @Component annotation tells Spring container to automatically create Spring bean.
    by default provider bean name small name of class pizzaController passing name of bean

#### @Autowired annotation is used to inject the bean automatically
    @Autowired annotation is used to inject the dependency using constructor injection, setter injection and field injection

#### @Qualifier Annotation
    is used in conjunction with Autowired to avoid confusion when have tow
    or more beans configured for same  type;

#### @Primary annotation
    to give higher preference to a bean when there are multiple beans of same type.

#### @Bean annotation
    that a method produces a bean to be managed by the spring container.
    usually declared in Configuration class to create Spring Bean definitions 
    by default, bean name is same as method name and also provide name of bean using
    @Bean(name"beanname")
    @bean annotation provides initMethod and destroyMethod

#### Stereotype annotations
    These annotation are used to craete Spring beans automatically in the applucation context(Spring Ioc container)
    The main stereotype annotation is @Component
    By using this annation, Spring provides more Stereotype meta annotaion such as @
    @Service, @Repository and @Controller

#### Lazy annotation
    by default, Spring cretes all singleton eagerly at the startup/bootstrapping of the application context.
    You can load th spring beans lazily(on demand) usimg @Lazy annotation
    @Lazy annotation can used with @configuration, @Componenet and @Bean
    Eager intialization is recoomended: to avod and detech all possible error immdediately rather than at runtime.

#### spring bean scopes
    the latest version of the spring frameworks defines 6 types of scopes:
    singleton, prototype, request, session , application, websocket
#### @Scope Annotation
    it is used to define a scope of the bean
    we use @Scope to define of a @Component class or @Bean definition.
    
    Singleton : only one instance of the bean is created and shared across the entire application, 
    this is the default ascope
    Prototype : a new instance of the nean is created every time it is requested.