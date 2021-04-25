
# Multi-module application [🚧 **under construction**] 
- Application for practicing multi-module software architecture.    

## Use case 
- A simple application that consumes a Dog Fact and Dog Picture API using dependency injection, clean code and some clean architecture principles.    
<br />    
<img src="https://i.ibb.co/BPhvJV0/Capturar.jpg" alt="DogFacts application" border="0" width="300" />


## Layers 

<img src="https://i.ibb.co/T2sZ5Xy/architecture-android.jpg" alt="architecture-android"  width="150" border="0"/>    
<img src="https://i.ibb.co/FY4S6gw/architecture.jpg" alt="architecture" width="450" border="0"/> 
   
### app [android module]
- Responsible for holding all UI/Navigation dependencies    
### base [android library]  
- Application layer. It provides all dependency injection graph and makes a bridge between another layers.    
### network [kotlin library]
- Network APIs and its business rules consuming public APIs.
- <a href="https://github.com/DukeNgn/Dog-facts-API" target="_blank">Dog Facts API</a>
- <a href="https://github.com/ElliottLandsborough/dog-ceo-api" target="_blank">Dog Picture API</a>
### features [android module]
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