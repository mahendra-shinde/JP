import { TestBed } from '@angular/core/testing';

import { EmpdataService } from './empdata.service';

describe('EmpdataService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: EmpdataService = TestBed.get(EmpdataService);
    expect(service).toBeTruthy();
  });
});
