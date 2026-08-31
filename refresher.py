animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"] 

def check_animal(name):
    for animal in animals:
        if animal == name:
            print(f"{name} is in the list.")
            return
    print(f"{name} is not in the list.")


check_animal("cat")
check_animal("guinea pig")

