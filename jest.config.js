module.exports = {
    // preset: 'jest-puppeteer',
    // verbose: true,
    reporters: [
        'default',
        [
            'jest-xunit',
            {
                traitsRegex: [
                    { regex: /\(Test Type:([^,)]+)(,|\)).*/g, name: 'Category' },
                    { regex: /.*Test Traits: ([^)]+)\).*/g, name: 'Type' }
                ]

            }
        ]
    ]
};
