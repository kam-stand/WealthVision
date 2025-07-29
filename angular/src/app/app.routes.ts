import { Routes } from '@angular/router';
import { Auth } from './auth/auth';
import { Main } from './main/main';


export const routes: Routes = [
    {path: '', component: Auth},
    {path: "main", component: Main},
    
];
