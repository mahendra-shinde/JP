import { TestBed } from '@angular/core/testing';

import { EmpDataService } from './emp-data.service';

describe('EmpDataService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmpDataService = TestBed.get(EmpDataService);
    expect(service).toBeTruthy();
  });
});
