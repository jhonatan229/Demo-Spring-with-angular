import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { CommonModule } from '@angular/common';  
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MainPage } from './pages/pages.mainPage.component';
import { FormRegisterComponent } from './components/form-register/form-register.component';

@NgModule({
  declarations: [
    AppComponent, MainPage, FormRegisterComponent
  ],
  imports: [
	CommonModule,
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
