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