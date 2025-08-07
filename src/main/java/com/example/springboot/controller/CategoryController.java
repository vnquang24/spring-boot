package com.example.springboot.controller;

import com.example.springboot.model.Category;
import com.example.springboot.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> getAllCategories() {
        return categoryService.getAllCategories().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoryDTO> getCategoryById(@PathVariable Integer id) {
        Optional<Category> category = categoryService.getCategoryById(id);
        return category.map(cat -> ResponseEntity.ok(convertToDTO(cat)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public CategoryDTO createCategory(@RequestBody Category category) {
        Category created = categoryService.createCategory(category);
        return convertToDTO(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CategoryDTO> updateCategory(@PathVariable Integer id, @RequestBody Category categoryDetails) {
        Category updated = categoryService.updateCategory(id, categoryDetails);
        if (updated != null) return ResponseEntity.ok(convertToDTO(updated));
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCategory(@PathVariable Integer id) {
        if (categoryService.deleteCategory(id)) return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }

    private CategoryDTO convertToDTO(Category category) {
        CategoryDTO dto = new CategoryDTO();
        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setDescription(category.getDescription());
        dto.setCreatedAt(category.getCreatedAt());
        dto.setUpdatedAt(category.getUpdatedAt());
        
        if (category.getParent() != null) {
            dto.setParentId(category.getParent().getId());
            dto.setParentName(category.getParent().getName());
        }
        
        return dto;
    }

    // DTO class để tránh infinite recursion
    public static class CategoryDTO {
        private Integer id;
        private String name;
        private String description;
        private Integer parentId;
        private String parentName;
        private java.time.LocalDateTime createdAt;
        private java.time.LocalDateTime updatedAt;

        // Getters and Setters
        public Integer getId() { return id; }
        public void setId(Integer id) { this.id = id; }
        
        public String getName() { return name; }
        public void setName(String name) { this.name = name; }
        
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        
        public Integer getParentId() { return parentId; }
        public void setParentId(Integer parentId) { this.parentId = parentId; }
        
        public String getParentName() { return parentName; }
        public void setParentName(String parentName) { this.parentName = parentName; }
        
        public java.time.LocalDateTime getCreatedAt() { return createdAt; }
        public void setCreatedAt(java.time.LocalDateTime createdAt) { this.createdAt = createdAt; }
        
        public java.time.LocalDateTime getUpdatedAt() { return updatedAt; }
        public void setUpdatedAt(java.time.LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
    }
} 