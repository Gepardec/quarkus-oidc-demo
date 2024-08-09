import {Component, inject} from '@angular/core';
import {toSignal} from "@angular/core/rxjs-interop";
import {UserService} from "./user.service";

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [],
  templateUrl: './user.component.html',
  styleUrl: './user.component.scss'
})
export class UserComponent {

  private userService = inject(UserService);

  user = toSignal(this.userService.$user);
}
