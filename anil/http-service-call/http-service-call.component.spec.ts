import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HttpServiceCallComponent } from './http-service-call.component';

describe('HttpServiceCallComponent', () => {
  let component: HttpServiceCallComponent;
  let fixture: ComponentFixture<HttpServiceCallComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HttpServiceCallComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HttpServiceCallComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
