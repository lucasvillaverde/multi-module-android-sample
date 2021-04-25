
# Multi-module application [🚧 **under construction**] 
- Application for practicing multi-module software architecture.    

## Use case 
- A simple application that consumes a Dog Fact and Dog Picture API using dependency injection, clean code and some clean architecture principles.    
<br />    
<img src="https://i.ibb.co/BPhvJV0/Capturar.jpg" alt="DogFacts application" border="0" width="300" />


## Layers 

<img src="https://i.ibb.co/T2sZ5Xy/architecture-android.jpg" alt="architecture-android"  width="150" border="0"/>    
<img src="https://i.ibb.co/FY4S6gw/architecture.jpg" alt="architecture" width="450" border="0"/> 
   
### app  
- Responsible for holding all UI/Navigation dependencies    
### base    
- Application layer. It provides all dependency injection graph and make a bridge between another layers.    
### network    
- Network APIs and its business rules.    
### features    
- Dynamic features that consume base and app layer.    
 
## Android/Kotlin usage    
- KTX libraries    
- ViewBinding    
- Picasso    
- Kotlin flow    
- LiveData    
- Observer    
- Retrofit    
- OkHttp    
- Kodein    
- Dynamic features