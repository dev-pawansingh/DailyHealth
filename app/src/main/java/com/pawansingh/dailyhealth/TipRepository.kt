package com.pawansingh.dailyhealth

object TipRepository {
    val healthTips = listOf(
        HealthTip("Drink at least 8 glasses of water daily.", "Nutrition"),
        HealthTip("Take a 10-minute walk every day.", "Fitness"),
        HealthTip("Practice mindfulness for 5 minutes daily.", "Mental Health"),
        HealthTip("Eat a balanced diet with fruits and vegetables.", "Nutrition"),
        HealthTip("Get 7-8 hours of sleep every night.", "Mental Health"),
        HealthTip("Stretch for 5-10 minutes every morning.", "Fitness"),
        HealthTip("Limit screen time before bed for better sleep.", "Mental Health"),
        HealthTip("Include protein-rich foods in your diet.", "Nutrition"),
        HealthTip("Stay hydrated by drinking water instead of sugary drinks.", "Nutrition"),
        HealthTip("Maintain good posture to prevent back pain.", "Fitness"),
        HealthTip("Take deep breaths to reduce stress and relax.", "Mental Health"),
        HealthTip("Eat whole grains instead of refined carbs.", "Nutrition"),
        HealthTip("Engage in 30 minutes of physical activity daily.", "Fitness"),
        HealthTip("Spend time in nature to boost mental well-being.", "Mental Health"),
        HealthTip("Avoid processed foods and opt for natural alternatives.", "Nutrition"),
        HealthTip("Use stairs instead of elevators for extra movement.", "Fitness"),
        HealthTip("Write down three things you're grateful for daily.", "Mental Health"),
        HealthTip("Eat small, frequent meals to maintain energy levels.", "Nutrition"),
        HealthTip("Do strength training exercises twice a week.", "Fitness"),
        HealthTip("Maintain social connections for emotional health.", "Mental Health"),
        HealthTip("Practice portion control to avoid overeating.", "Nutrition"),
        HealthTip("Reduce caffeine intake in the evening for better sleep.", "Mental Health"),
        HealthTip("Wear sunscreen to protect your skin from UV rays.", "Fitness"),
        HealthTip("Avoid excessive sugar to maintain stable energy levels.", "Nutrition"),
        HealthTip("Listen to calming music to reduce anxiety.", "Mental Health"),
        HealthTip("Incorporate healthy fats like nuts and seeds into your diet.", "Nutrition"),
        HealthTip("Warm up before exercising to prevent injuries.", "Fitness"),
        HealthTip("Take breaks from work to rest your mind and body.", "Mental Health"),
        HealthTip("Eat fiber-rich foods to improve digestion.", "Nutrition"),
        HealthTip("Try yoga to enhance flexibility and reduce stress.", "Fitness"),
        HealthTip("Laugh often to boost your mood and immune system.", "Mental Health"),
        HealthTip("Choose fresh fruits over sugary snacks.", "Nutrition"),
        HealthTip("Practice deep squats to strengthen your lower body.", "Fitness"),
        HealthTip("Read books to enhance mental clarity and reduce stress.", "Mental Health"),
        HealthTip("Avoid trans fats and opt for healthier oils.", "Nutrition"),
        HealthTip("Cycle or walk instead of using a car for short distances.", "Fitness"),
        HealthTip("Meditate for 10 minutes to clear your mind.", "Mental Health"),
        HealthTip("Add more leafy greens to your meals for better health.", "Nutrition"),
        HealthTip("Strengthen your core with planks and sit-ups.", "Fitness"),
        HealthTip("Stay socially active to reduce loneliness and stress.", "Mental Health"),
        HealthTip("Limit alcohol intake for better liver and heart health.", "Nutrition"),
        HealthTip("Dance to improve coordination and cardiovascular health.", "Fitness"),
        HealthTip("Take a power nap (15-20 minutes) for energy and focus.", "Mental Health"),
        HealthTip("Eat probiotic foods like yogurt for gut health.", "Nutrition"),
        HealthTip("Jump rope for a fun and effective cardio workout.", "Fitness"),
        HealthTip("Practice positive affirmations to boost self-confidence.", "Mental Health"),
        HealthTip("Reduce salt intake to maintain healthy blood pressure.", "Nutrition"),
        HealthTip("Do push-ups daily to build upper body strength.", "Fitness"),
        HealthTip("Prioritize self-care to improve overall well-being.", "Mental Health")

    )

    fun getRandomTip(): HealthTip {
        return healthTips.random()
    }
}