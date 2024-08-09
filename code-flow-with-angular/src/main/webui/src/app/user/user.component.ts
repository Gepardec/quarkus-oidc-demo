import {Component, inject} from '@angular/core';
import {toSignal} from "@angular/core/rxjs-interop";
import {UserResourceService} from "../../generated/user-resource/user-resource.service";
import {User} from "../../generated/model";

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [],
  templateUrl: './user.component.html',
  styleUrl: './user.component.scss'
})
export class UserComponent {

  private userService = inject(UserResourceService);

  user = toSignal(this.userService.getApiUser<User>());
}
