from pydantic import BaseModel , Field, field_validator, model_validator
from typing import Optional, Literal

class Category(BaseModel): # Pydantic Model
    name:Literal["starter", "main course", "dessert", "beverage"]

class Models(BaseModel):
    
    # Field  : Value Type
    
    id: int
    name: str = Field(..., min_length = 3, max_length = 50, description = "Item Name") # Field(...) means Required Value
    price: float = Field(..., gt = 0, description = "Item price") # gt = 0,  means greater than 0 (price > 0)
    category: Category = Field(description = "Item category")
    is_available: bool = Field(default = True) # default value of (is_availiable = True)
    description:  Optional[str] = None
    
    # Field Validator = it work on only one field
    @field_validator("name")
    @classmethod
    def title_name(cls,value): # value = "Paneer TIKKA" "Paneer Tikka"
        return value.title()

    # Model Validator = it can be work on multiple field
    @model_validator(mode="after")
    # ComputedField
    def check_available(self):
        if self.is_available and self.price <= 0:
            raise("available item must have price greater than 0")
        return self




    

item = Models(id = 1,name = "Paneer TIKKA", price = 22.89, category = Category(name='starter'), is_available = True, description = "this product is good")