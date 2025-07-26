import { Routes } from '@angular/router';
import { Auth } from './auth/auth';
import { Profile } from './profile/profile';


export const routes: Routes = [
    {path: '', component: Auth},
    {path: 'profile', component: Profile}
    
];
