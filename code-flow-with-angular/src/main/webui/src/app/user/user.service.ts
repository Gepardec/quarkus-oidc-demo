import {inject, Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {User} from "./user";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private httpClient = inject(HttpClient);

  $user = this.httpClient.get<User>('/api/user');
}
