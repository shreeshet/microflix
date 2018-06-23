import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButtonModule, MatToolbarModule, MatGridListModule ,MatCardModule,MatFormFieldModule,MatInputModule,MatBadgeModule,MatIconModule,MatTooltipModule } from '@angular/material';
import {MatListModule} from '@angular/material/list';


@NgModule({
  imports: [
    CommonModule, MatButtonModule, MatToolbarModule,MatGridListModule,MatCardModule,MatFormFieldModule,MatInputModule,MatListModule,MatBadgeModule,MatIconModule,MatTooltipModule
  ],
  exports: [
  	CommonModule, MatButtonModule, MatToolbarModule,MatGridListModule,MatCardModule,MatFormFieldModule,MatInputModule,MatListModule,MatBadgeModule,MatIconModule,MatTooltipModule
  ],
  declarations: []
})
export class CustommaterialModule { }
