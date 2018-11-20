import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmplistserviceComponent } from './emplistservice.component';

describe('EmplistserviceComponent', () => {
  let component: EmplistserviceComponent;
  let fixture: ComponentFixture<EmplistserviceComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmplistserviceComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmplistserviceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
